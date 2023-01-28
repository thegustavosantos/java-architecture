package br.com.alura.school.infra.student;

import br.com.alura.school.domain.student.CPF;
import br.com.alura.school.domain.student.Phone;
import br.com.alura.school.domain.student.Student;
import br.com.alura.school.domain.student.StudentRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class StudentRepositoryJDCB implements StudentRepository {

    private final Connection connection;

    public StudentRepositoryJDCB(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void register(Student student) {
        String studentSql  = "INSERT INTO STUDENT VALUES(?, ?, ?)";
        String phoneSql  = "INSERT INTO PHONE VALUES(?, ?)";

        try {
            var ps = connection.prepareStatement(studentSql);
            ps.setString(1 , student.getCPF());
            ps.setString(2 , student.getName());
            ps.setString(3 , student.getEmail());
            ps.execute();

            ps = connection.prepareStatement(phoneSql);
            for (Phone phone : student.getPhones()) {
                ps.setString(1 , phone.getDdd());
                ps.setString(2 , phone.getNumber());
                ps.execute();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Student getByCPF(CPF cpf) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }
}

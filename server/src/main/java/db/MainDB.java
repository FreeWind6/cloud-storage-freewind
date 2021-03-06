package db;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "main")
public class MainDB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "folderName", nullable = false)
    private String folderName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public MainDB() {
    }

    public MainDB(String login, String password, String folderName) {
        this.login = login;
        this.password = password;
        this.folderName = folderName;
    }
}

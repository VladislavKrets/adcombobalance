package online.omnia.balance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by lollipop on 12.07.2017.
 */
@Table(name = "adverts")
@Entity
public class AdvertsEntity {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "advname", length = 100)
    private String advName;
    @Column(name = "secretkey")
    private String secretKey;

    public int getId() {
        return id;
    }

    public String getAdvName() {
        return advName;
    }

    public String getSecretKey() {
        return secretKey;
    }
}

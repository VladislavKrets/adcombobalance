package online.omnia.balance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by lollipop on 16.12.2017.
 */
@Entity
@Table(name = "adverts_balance")
public class AdvertsBalanceEntity {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "adv_id")
    private int advId;
    @Column(name = "currency_id")
    private int currencyId;
    @Column(name = "sum")
    private double sum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdvId() {
        return advId;
    }

    public void setAdvId(int advId) {
        this.advId = advId;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}

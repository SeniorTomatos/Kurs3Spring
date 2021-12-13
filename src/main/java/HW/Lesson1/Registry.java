package HW.Lesson1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Registry")
public class Registry {

    private Referral referral;

    public Referral getReferral() {
        return referral;
    }

    @Autowired(required = false)
    @Qualifier("Referral")
    public void setReferral (Referral referral) {
        this.referral = referral;
    }

    public void issue_direction() {
        System.out.println("Complete");
        referral.direct();
    }

}

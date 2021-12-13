package HW.Lesson1;


import org.springframework.stereotype.Component;

@Component("Referral")
public class ReferralDoctor implements Referral{
        public void direct() {
            System.out.println("Complete");
        }


}

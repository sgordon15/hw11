package edu.ti.caih313.collections.dataobj;

//import sun.security.mscapi.PRNG;

import java.util.HashMap;
import java.util.Map;

public class EmailAddress {
    public enum EmailType {HOME, WORK, SCHOOL}

    HashMap<EmailType, String> personsEmailAddress = new HashMap<EmailType, String>();

    public String getPrimaryEmail(EmailType emailType) {
        if (personsEmailAddress.containsKey(emailType.HOME)) {
            return emailType.HOME.toString();
        } else if (personsEmailAddress.containsKey(emailType.WORK)) {
            return emailType.WORK.toString();
        } else if (personsEmailAddress.containsKey(emailType.SCHOOL)) {
            return emailType.SCHOOL.toString();
        } else {
            return null;
        }

    }
}


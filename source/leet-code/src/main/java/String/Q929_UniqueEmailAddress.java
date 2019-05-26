package String;

import java.util.HashSet;
import java.util.Set;

public class Q929_UniqueEmailAddress {
    public int numUniqueEmails(String[] emails) {
        Set<String> receiver = new HashSet();

        for (String email : emails) {
            int index = email.indexOf('@');

            String local = email.substring(0,index);
            String domain = email.substring(index);

            if (local.contains("+")) {
                local = local.substring(0,local.indexOf('+'));
            }

            local = local.replaceAll("\\." , "");

            receiver.add(local+domain);
        }

        return receiver.size();
    }
}

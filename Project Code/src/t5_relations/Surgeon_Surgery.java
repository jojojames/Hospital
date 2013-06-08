package t5_relations;

import t5_domain_objects.Surgeon;
import t5_domain_objects.Surgery;

public class Surgeon_Surgery {
    public Surgery surgery;
    public Surgeon surgeon;

    /**
     *
     */
    public Surgeon_Surgery(Surgery surgery, Surgeon surgeon) {
        this.surgeon = surgeon;
        this.surgery = surgery;
    }
}

package t5_objects;

public class Medicine {
    public Prescription prescription;
    private int Medicine;
    private float Price;
    private String MedicineDesc;
    public Allergies allergies;

    /**
     *
     * @param Medicine
     * @param price
     * @param MedicineDesc
     */
    public Medicine(int Medicine, float price, String MedicineDesc) {
        this.Medicine = Medicine;
        this.Price = price;
        this.MedicineDesc = MedicineDesc;
    }
}

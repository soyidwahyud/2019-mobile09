package id.ac.polinema.recyclerviewsangatsederhana.models;

public class pesawattempur {
    public int image;
    public String nama;
    public String buatan;

    public pesawattempur(int image, String nama, String buatan) {
        this.image = image;
        this.nama = nama;
        this.buatan = buatan;
    }

    public String getBuatan() {
        return buatan;
    }

    public void setBuatan(String buatan) {
        this.buatan = buatan;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

package id.ac.polinema.recyclerviewsangatsederhana.models;

public class pesawatlatih {
    public int image;
    public String nama;

    public pesawatlatih(int image, String nama) {
        this.image = image;
        this.nama = nama;
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

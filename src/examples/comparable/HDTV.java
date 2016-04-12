package examples.comparable;

class HDTV implements Comparable<HDTV> {

    private int size;
    private String brand;

    public HDTV(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    public HDTV() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int compareTo(HDTV tv) {

        if (this.getSize() > tv.getSize()) {
            return 1;
        } else if (this.getSize() < tv.getSize()) {
            return -1;
        } else {
            return 0;
        }
    }
    /*
    if class is declared as following (not Comparable<HDTV> then need to Override method compareTo as shown below    
    class HDTV implements Comparable
    
    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
}

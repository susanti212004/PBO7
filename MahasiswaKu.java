public class MahasiswaKu {

    public static void main(String[] args) {
        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();
        m.setNi("20220040188");
        m.setName("Susanti");
        m.setClas(22);

        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClas());
    }
}

class Mahasiswa<T1, T2, T3> {
    private T1 nim;
    private T2 name;
    private T3 clas;

    public Mahasiswa() {
    }

    public T1 getNim() {
        return this.nim;
    }

    public void setNi(T1 var1) {
        this.nim = var1;
    }

    public T2 getName() {
        return this.name;
    }

    public void setName(T2 var1) {
        this.name = var1;
    }

    public T3 getClas() {
        return this.clas;
    }

    public void setClas(T3 var1) {
        this.clas = var1;
    }
}
package Exercise;

class Pegawai {
    protected String nama;
    protected int gaji;

    public Pegawai() {}

    public Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }
}

class Manajer extends Pegawai {
    private int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    public int getGaji() {
        return super.getGaji();  // Return only base gaji
    }

    public int getTunjangan() {
        return tunjangan;
    }
}

class Programmer extends Pegawai {
    private int bonus;

    public Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    @Override
    public int getGaji() {
        return super.getGaji();  // Return only base gaji
    }

    public int getBonus() {
        return bonus;
    }
}


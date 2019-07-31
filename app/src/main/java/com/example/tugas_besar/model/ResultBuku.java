
package com.example.tugas_besar.model;

import java.util.HashMap;
import java.util.Map;

public class ResultBuku {

    private String idBuku;
    private String namaBuku;
    private String penerbit;
    private String tahunKeluar;
    private String jenisBuku;
    private String gambar;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTahunKeluar() {
        return tahunKeluar;
    }

    public void setTahunKeluar(String tahunKeluar) {
        this.tahunKeluar = tahunKeluar;
    }

    public String getJenisBuku() {
        return jenisBuku;
    }

    public void setJenisBuku(String jenisBuku) {
        this.jenisBuku = jenisBuku;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

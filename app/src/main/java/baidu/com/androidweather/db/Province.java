package baidu.com.androidweather.db;

import org.litepal.crud.DataSupport;

/*
 *  创建者:   Administrator
 *  创建时间:  2017/10/10 0010 15:08
 *  描述：    TODO
 */
public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}

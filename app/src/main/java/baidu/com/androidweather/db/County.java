package baidu.com.androidweather.db;

import org.litepal.crud.DataSupport;

/*
 *  创建者:   Administrator
 *  创建时间:  2017/10/10 0010 15:11
 *  描述：    TODO
 */
public class County extends DataSupport{
    private int id;
    private String CountyName;
    private int weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return CountyName;
    }

    public void setCountyName(String countyName) {
        CountyName = countyName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

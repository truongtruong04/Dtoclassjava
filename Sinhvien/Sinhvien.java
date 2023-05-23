package Sinhvien;

public class Sinhvien {
private int day ;
private int moth ;
private int year;
public Sinhvien( int day , int moth , int year){
      if (day >= 1  && day <= 31) {
            this.day = day ;
      } else {
            this.day = 1;
      }
      if (moth >= 1 && moth <= 12){
            this.moth = moth ;
      }else {
            this.moth = 1;
      }
      if (year >=1){
            this.year = year;
      }else {
            this.year = 1;
      }
}
public int getDay(){
      return this.day;
}
public void setDay(int d ){
      if (d >= 1 &&  d<= 31);
      this.day = d ;
}
public int getMonth(){
      return this.moth ;
}
public void setMoth( int m ){
      if (m >=1 && m <= 12)
      this.moth = 1 ;
}
public int getYear() {
      return year;
}
public void setYear(int y){
      if(y>=1)
      this.year = y;
}
      }
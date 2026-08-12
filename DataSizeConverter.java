package converter;
public class DataSizeConverter{
private double bytes;
public DataSizeConverter(double value, String unit)
{
Switch (unit.toLowerCase())
{
case "kb":
this.bytes=vaule*1024;
break;
case "mb":
this.bytes=value * 1024 * 1024;
break;
case "gb":
this.bytes=value * 1024 * 1024 * 1024;
break;
case "tb":
this.bytes=value * 1024 * 1024 * 1024 * 1024;
break;
default:
this.bytes=value;
}
}
public double to KB(){return bytes/1024;}
public double to MB(){return bytes/(1024 * 1024);}
public double to GB(){return bytes/(1024 * 1024 * 1024);}
public double to TB(){return bytes/(1024 * 1024 * 1024 * 1024);}
public double to MB(){return bytes;}
}


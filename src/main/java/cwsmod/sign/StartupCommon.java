package cwsmod.sign;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {
	public static Cwsign Cwsign = new Cwsign("cwsign");
	public static ICwsign ICwsign = (ICwsign) new ICwsign(Cwsign).setRegistryName(Cwsign.getRegistryName());
	public static Cwsign Noenter = new Cwsign("noenter");
	public static ICwsign INoenter = (ICwsign) new ICwsign(Noenter).setRegistryName(Noenter.getRegistryName());
	public static Cwsign Speed40 = new Cwsign("speed40");
	public static ICwsign ISpeed40 = (ICwsign) new ICwsign(Speed40).setRegistryName(Speed40.getRegistryName());
	public static Cwsign Speed60 = new Cwsign("speed60");
	public static ICwsign ISpeed60 = (ICwsign) new ICwsign(Speed60).setRegistryName(Speed60.getRegistryName());
	public static Cwsign Speed70 = new Cwsign("speed70");
	public static ICwsign ISpeed70 = (ICwsign) new ICwsign(Speed70).setRegistryName(Speed70.getRegistryName());
	public static Cwsign Back = new Cwsign("back");
	public static ICwsign IBack = (ICwsign) new ICwsign(Back).setRegistryName(Back.getRegistryName());
	public static Cwsign Bike = new Cwsign("bike");
	public static ICwsign IBike = (ICwsign) new ICwsign(Bike).setRegistryName(Bike.getRegistryName());
	public static Cwsign Bus = new Cwsign("bus");
	public static ICwsign IBus = (ICwsign) new ICwsign(Bus).setRegistryName(Bus.getRegistryName());
	public static Cwsign Canteen = new Cwsign("canteen");
	public static ICwsign ICanteen = (ICwsign) new ICwsign(Canteen).setRegistryName(Canteen.getRegistryName());
	public static Cwsign Car = new Cwsign("car");
	public static ICwsign ICar = (ICwsign) new ICwsign(Car).setRegistryName(Car.getRegistryName());
	public static Cwsign Hotel = new Cwsign("hotel");
	public static ICwsign IHotel = (ICwsign) new ICwsign(Hotel).setRegistryName(Hotel.getRegistryName());
	public static Cwsign Left = new Cwsign("left");
	public static ICwsign ILeft = (ICwsign) new ICwsign(Left).setRegistryName(Left.getRegistryName());
	public static Cwsign Noback = new Cwsign("noback");
	public static ICwsign INoback = (ICwsign) new ICwsign(Noback).setRegistryName(Noback.getRegistryName());
	public static Cwsign Nobike = new Cwsign("nobike");
	public static ICwsign INobike = (ICwsign) new ICwsign(Nobike).setRegistryName(Nobike.getRegistryName());
	public static Cwsign Nocar = new Cwsign("nocar");
	public static ICwsign INocar = (ICwsign) new ICwsign(Nocar).setRegistryName(Nocar.getRegistryName());
	public static Cwsign Noleft = new Cwsign("noleft");
	public static ICwsign INoleft = (ICwsign) new ICwsign(Noleft).setRegistryName(Noleft.getRegistryName());
	public static Cwsign Nomoto = new Cwsign("nomoto");
	public static ICwsign INomoto = (ICwsign) new ICwsign(Nomoto).setRegistryName(Nomoto.getRegistryName());
	public static Cwsign Nopass = new Cwsign("nopass");
	public static ICwsign INopass = (ICwsign) new ICwsign(Nopass).setRegistryName(Nopass.getRegistryName());
	public static Cwsign Nopeople = new Cwsign("nopeople");
	public static ICwsign INopeople = (ICwsign) new ICwsign(Nopeople).setRegistryName(Nopeople.getRegistryName());
	public static Cwsign Noright = new Cwsign("noright");
	public static ICwsign INoright = (ICwsign) new ICwsign(Noright).setRegistryName(Noright.getRegistryName());
	public static Cwsign Nostop = new Cwsign("nostop");
	public static ICwsign INostop = (ICwsign) new ICwsign(Nostop).setRegistryName(Nostop.getRegistryName());
	public static Cwsign Notice = new Cwsign("notice");
	public static ICwsign INotice = (ICwsign) new ICwsign(Notice).setRegistryName(Notice.getRegistryName());
	public static Cwsign Notruk = new Cwsign("notruk");
	public static ICwsign INotruk = (ICwsign) new ICwsign(Notruk).setRegistryName(Notruk.getRegistryName());
	public static Cwsign Npeople = new Cwsign("npeople");
	public static ICwsign INpeople = (ICwsign) new ICwsign(Npeople).setRegistryName(Npeople.getRegistryName());
	public static Cwsign Nrail = new Cwsign("nrail");
	public static ICwsign INrail = (ICwsign) new ICwsign(Nrail).setRegistryName(Nrail.getRegistryName());
	public static Cwsign Nrough = new Cwsign("nrough");
	public static ICwsign INrough = (ICwsign) new ICwsign(Nrough).setRegistryName(Nrough.getRegistryName());
	public static Cwsign Oil = new Cwsign("oil");
	public static ICwsign IOil = (ICwsign) new ICwsign(Oil).setRegistryName(Oil.getRegistryName());
	public static Cwsign Phone = new Cwsign("phone");
	public static ICwsign IPhone = (ICwsign) new ICwsign(Phone).setRegistryName(Phone.getRegistryName());
	public static Cwsign Rang = new Cwsign("rang");
	public static ICwsign IRang = (ICwsign) new ICwsign(Rang).setRegistryName(Rang.getRegistryName());
	public static Cwsign Repair = new Cwsign("repair");
	public static ICwsign IRepair = (ICwsign) new ICwsign(Repair).setRegistryName(Repair.getRegistryName());
	public static Cwsign Right = new Cwsign("right");
	public static ICwsign IRight = (ICwsign) new ICwsign(Right).setRegistryName(Right.getRegistryName());
	public static Cwsign Stop = new Cwsign("stop");
	public static ICwsign IStop = (ICwsign) new ICwsign(Stop).setRegistryName(Stop.getRegistryName());
	public static Cwsign Toleft = new Cwsign("toleft");
	public static ICwsign IToleft = (ICwsign) new ICwsign(Toleft).setRegistryName(Toleft.getRegistryName());
	public static Cwsign Toright = new Cwsign("toright");
	public static ICwsign IToright = (ICwsign) new ICwsign(Toright).setRegistryName(Toright.getRegistryName());
	public static Cwsign Wind = new Cwsign("wind");
	public static ICwsign IWind = (ICwsign) new ICwsign(Wind).setRegistryName(Wind.getRegistryName());
	public static Cwsign Working = new Cwsign("working");
	public static ICwsign IWorking = (ICwsign) new ICwsign(Working).setRegistryName(Working.getRegistryName());
	public static Cwsign Gostraight = new Cwsign("gostraight");
	public static ICwsign IGostraight = (ICwsign) new ICwsign(Gostraight).setRegistryName(Gostraight.getRegistryName());
	public static Cwsign High4 = new Cwsign("high4");
	public static ICwsign IHigh4 = (ICwsign) new ICwsign(High4).setRegistryName(High4.getRegistryName());
	public static Cwsign High8 = new Cwsign("high8");
	public static ICwsign IHigh8 = (ICwsign) new ICwsign(High8).setRegistryName(High8.getRegistryName());
	public static Cwsign Nlcar = new Cwsign("nlcar");
	public static ICwsign INlcar = (ICwsign) new ICwsign(Nlcar).setRegistryName(Nlcar.getRegistryName());
	public static Cwsign Noovertacking = new Cwsign("noovertacking");
	public static ICwsign INoovertacking = (ICwsign) new ICwsign(Noovertacking)
			.setRegistryName(Noovertacking.getRegistryName());
	public static Cwsign Nosleft = new Cwsign("nosleft");
	public static ICwsign INosleft = (ICwsign) new ICwsign(Nosleft).setRegistryName(Nosleft.getRegistryName());
	public static Cwsign Nosright = new Cwsign("nosright");
	public static ICwsign INosright = (ICwsign) new ICwsign(Nosright).setRegistryName(Nosright.getRegistryName());
	public static Cwsign Nostraight = new Cwsign("nostraight");
	public static ICwsign INostraight = (ICwsign) new ICwsign(Nostraight).setRegistryName(Nostraight.getRegistryName());
	public static Cwsign Nrcar = new Cwsign("nrcar");
	public static ICwsign INrcar = (ICwsign) new ICwsign(Nrcar).setRegistryName(Nrcar.getRegistryName());
	public static Cwsign Overtacking = new Cwsign("overtacking");
	public static ICwsign IOvertacking = (ICwsign) new ICwsign(Overtacking)
			.setRegistryName(Overtacking.getRegistryName());
	public static Cwsign Parking = new Cwsign("parking");
	public static ICwsign IParking = (ICwsign) new ICwsign(Parking).setRegistryName(Parking.getRegistryName());
	public static Cwsign Sstraight = new Cwsign("sstraight");
	public static ICwsign ISstraight = (ICwsign) new ICwsign(Sstraight).setRegistryName(Sstraight.getRegistryName());
	public static Cwsign Working2 = new Cwsign("working2");
	public static ICwsign IWorking2 = (ICwsign) new ICwsign(Working2).setRegistryName(Working2.getRegistryName());
	public static Cwsign Working3 = new Cwsign("working3");
	public static ICwsign IWorking3 = (ICwsign) new ICwsign(Working3).setRegistryName(Working3.getRegistryName());
	public static Cwsign Slrtl = new Cwsign("slrtl");
	public static ICwsign ISlrtl = (ICwsign) new ICwsign(Slrtl).setRegistryName(Slrtl.getRegistryName());
	public static Cwsign Slrtr = new Cwsign("slrtr");
	public static ICwsign ISlrtr = (ICwsign) new ICwsign(Slrtr).setRegistryName(Slrtr.getRegistryName());
	public static Cwsign Sbrtl = new Cwsign("sbrtl");
	public static ICwsign ISbrtl = (ICwsign) new ICwsign(Sbrtl).setRegistryName(Sbrtl.getRegistryName());
	public static Cwsign Sbrtr = new Cwsign("sbrtr");
	public static ICwsign ISbrtr = (ICwsign) new ICwsign(Sbrtr).setRegistryName(Sbrtr.getRegistryName());

	public static void preInitCommon() {
		GameRegistry.register(Cwsign);
		GameRegistry.register(ICwsign);
		GameRegistry.register(Noenter);
		GameRegistry.register(INoenter);
		GameRegistry.register(Speed40);
		GameRegistry.register(ISpeed40);
		GameRegistry.register(Speed60);
		GameRegistry.register(ISpeed60);
		GameRegistry.register(Speed70);
		GameRegistry.register(ISpeed70);
		GameRegistry.register(Back);
		GameRegistry.register(IBack);
		GameRegistry.register(Bike);
		GameRegistry.register(IBike);
		GameRegistry.register(Bus);
		GameRegistry.register(IBus);
		GameRegistry.register(Canteen);
		GameRegistry.register(ICanteen);
		GameRegistry.register(Car);
		GameRegistry.register(ICar);
		GameRegistry.register(Hotel);
		GameRegistry.register(IHotel);
		GameRegistry.register(Left);
		GameRegistry.register(ILeft);
		GameRegistry.register(Noback);
		GameRegistry.register(INoback);
		GameRegistry.register(Nobike);
		GameRegistry.register(INobike);
		GameRegistry.register(Nocar);
		GameRegistry.register(INocar);
		GameRegistry.register(Noleft);
		GameRegistry.register(INoleft);
		GameRegistry.register(Nomoto);
		GameRegistry.register(INomoto);
		GameRegistry.register(Nopass);
		GameRegistry.register(INopass);
		GameRegistry.register(Nopeople);
		GameRegistry.register(INopeople);
		GameRegistry.register(Noright);
		GameRegistry.register(INoright);
		GameRegistry.register(Nostop);
		GameRegistry.register(INostop);
		GameRegistry.register(Notice);
		GameRegistry.register(INotice);
		GameRegistry.register(Notruk);
		GameRegistry.register(INotruk);
		GameRegistry.register(Npeople);
		GameRegistry.register(INpeople);
		GameRegistry.register(Nrail);
		GameRegistry.register(INrail);
		GameRegistry.register(Nrough);
		GameRegistry.register(INrough);
		GameRegistry.register(Oil);
		GameRegistry.register(IOil);
		GameRegistry.register(Phone);
		GameRegistry.register(IPhone);
		GameRegistry.register(Rang);
		GameRegistry.register(IRang);
		GameRegistry.register(Repair);
		GameRegistry.register(IRepair);
		GameRegistry.register(Right);
		GameRegistry.register(IRight);
		GameRegistry.register(Stop);
		GameRegistry.register(IStop);
		GameRegistry.register(Toleft);
		GameRegistry.register(IToleft);
		GameRegistry.register(Toright);
		GameRegistry.register(IToright);
		GameRegistry.register(Wind);
		GameRegistry.register(IWind);
		GameRegistry.register(Working);
		GameRegistry.register(IWorking);
		GameRegistry.register(Gostraight);
		GameRegistry.register(IGostraight);
		GameRegistry.register(High4);
		GameRegistry.register(IHigh4);
		GameRegistry.register(High8);
		GameRegistry.register(IHigh8);
		GameRegistry.register(Nlcar);
		GameRegistry.register(INlcar);
		GameRegistry.register(Noovertacking);
		GameRegistry.register(INoovertacking);
		GameRegistry.register(Nosleft);
		GameRegistry.register(INosleft);
		GameRegistry.register(Nosright);
		GameRegistry.register(INosright);
		GameRegistry.register(Nostraight);
		GameRegistry.register(INostraight);
		GameRegistry.register(Nrcar);
		GameRegistry.register(INrcar);
		GameRegistry.register(Overtacking);
		GameRegistry.register(IOvertacking);
		GameRegistry.register(Parking);
		GameRegistry.register(IParking);
		GameRegistry.register(Sstraight);
		GameRegistry.register(ISstraight);
		GameRegistry.register(Working2);
		GameRegistry.register(IWorking2);
		GameRegistry.register(Working3);
		GameRegistry.register(IWorking3);
		GameRegistry.register(Slrtl);
		GameRegistry.register(ISlrtl);
		GameRegistry.register(Slrtr);
		GameRegistry.register(ISlrtr);
		GameRegistry.register(Sbrtl);
		GameRegistry.register(ISbrtl);
		GameRegistry.register(Sbrtr);
		GameRegistry.register(ISbrtr);

	}
}

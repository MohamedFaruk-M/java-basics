package com.nisfa.util;

public enum DistanceUnit {

	NanoMeter {
		public double toNano(double d) 	{return d;}
		public double toMicro(double d) {return d/(C1/C0);}
		public double toMilli(double d) {return d/(C2/C0);}
		public double toCenti(double d) {return d/(C3/C0);}
		public double toDeci(double d) 	{return d/(C4/C0);}
		public double toMeter(double d) {return d/(C5/C0);}
		public double toDeca(double d) 	{return d/(C6/C0);}
		public double toHecta(double d) {return d/(C7/C0);}
		public double toKilo(double d) 	{return d/(C8/C0);}
		public double toMile(double d) 	{return d/(C9/C0);}
		public double convert(double d, DistanceUnit u) {
			return u.toNano(d);
		}
	},
	MicroMeter {
		public double toNano(double d) 	{return x(d, (C0/C1), MAX/(C0/C1));}
		public double toMicro(double d) {return d;}
		public double toMilli(double d) {return d/(C2/C1);}
		public double toCenti(double d) {return d/(C3/C1);}
		public double toDeci(double d) 	{return d/(C4/C1);}
		public double toMeter(double d) {return d/(C5/C1);}
		public double toDeca(double d) 	{return d/(C6/C1);}
		public double toHecta(double d) {return d/(C7/C1);}
		public double toKilo(double d) 	{return d/(C8/C1);}
		public double toMile(double d) 	{return d/(C9/C1);}
		public double convert(double d, DistanceUnit u) {
			return u.toMicro(d);
		}
	},
	MilliMeter {
		public double toNano(double d) 	{return x(d, (C0/C2), MAX/(C0/C2));}
		public double toMicro(double d) {return x(d, (C1/C2), MAX/(C1/C2));}
		public double toMilli(double d) {return d;}
		public double toCenti(double d) {return d/(C3/C2);}
		public double toDeci(double d) 	{return d/(C4/C2);}
		public double toMeter(double d) {return d/(C5/C2);}
		public double toDeca(double d) 	{return d/(C6/C2);}
		public double toHecta(double d) {return d/(C7/C2);}
		public double toKilo(double d) 	{return d/(C8/C2);}
		public double toMile(double d) 	{return d/(C9/C2);}
		public double convert(double d, DistanceUnit u) {
			return u.toMilli(d);
		}
	},
	CentiMeter {
		public double toNano(double d) 	{return x(d, (C0/C3), MAX/(C0/C3));}
		public double toMicro(double d) {return x(d, (C1/C3), MAX/(C1/C3));}
		public double toMilli(double d) {return x(d, (C2/C3), MAX/(C2/C3));}
		public double toCenti(double d) {return d;}
		public double toDeci(double d) 	{return d/(C4/C3);}
		public double toMeter(double d) {return d/(C5/C3);}
		public double toDeca(double d) 	{return d/(C6/C3);}
		public double toHecta(double d) {return d/(C7/C3);}
		public double toKilo(double d) 	{return d/(C8/C3);}
		public double toMile(double d) 	{return d/(C9/C3);}
		public double convert(double d, DistanceUnit u) {
			return u.toCenti(d);
		}
	},
	DeciMeter {
		public double toNano(double d) 	{return x(d, (C0/C4), MAX/(C0/C4));}
		public double toMicro(double d) {return x(d, (C1/C4), MAX/(C1/C4));}
		public double toMilli(double d) {return x(d, (C2/C4), MAX/(C2/C4));}
		public double toCenti(double d) {return x(d, (C3/C4), MAX/(C3/C4));}
		public double toDeci(double d) 	{return d;}
		public double toMeter(double d) {return d/(C5/C4);}
		public double toDeca(double d) 	{return d/(C6/C4);}
		public double toHecta(double d) {return d/(C7/C4);}
		public double toKilo(double d) 	{return d/(C8/C4);}
		public double toMile(double d) 	{return d/(C9/C4);}
		public double convert(double d, DistanceUnit u) {
			return u.toDeci(d);
		}
	},
	Meter {
		public double toNano(double d) 	{return x(d, (C0/C5), MAX/(C0/C5));}
		public double toMicro(double d) {return x(d, (C1/C5), MAX/(C1/C5));}
		public double toMilli(double d) {return x(d, (C2/C5), MAX/(C2/C5));}
		public double toCenti(double d) {return x(d, (C3/C5), MAX/(C3/C5));}
		public double toDeci(double d) 	{return x(d, (C4/C5), MAX/(C4/C5));}
		public double toMeter(double d) {return d;}
		public double toDeca(double d) 	{return d/(C6/C5);}
		public double toHecta(double d) {return d/(C7/C5);}
		public double toKilo(double d) 	{return d/(C8/C5);}
		public double toMile(double d) 	{return d/(C9/C5);}
		public double convert(double d, DistanceUnit u) {
			return u.toMeter(d);
		}
	},
	DecaMeter {
		public double toNano(double d) 	{return x(d, (C0/C6), MAX/(C0/C6));}
		public double toMicro(double d) {return x(d, (C1/C6), MAX/(C1/C6));}
		public double toMilli(double d) {return x(d, (C2/C6), MAX/(C2/C6));}
		public double toCenti(double d) {return x(d, (C3/C6), MAX/(C3/C6));}
		public double toDeci(double d) 	{return x(d, (C4/C6), MAX/(C4/C6));}
		public double toMeter(double d) {return x(d, (C5/C6), MAX/(C5/C6));}
		public double toDeca(double d) 	{return d;}
		public double toHecta(double d) {return d/(C7/C6);}
		public double toKilo(double d) 	{return d/(C8/C6);}
		public double toMile(double d) 	{return d/(C9/C6);}
		public double convert(double d, DistanceUnit u) {
			return u.toDeca(d);
		}
	},
	HectaMeter {
		public double toNano(double d) 	{return x(d, (C0/C7), MAX/(C0/C7));}
		public double toMicro(double d) {return x(d, (C1/C7), MAX/(C1/C7));}
		public double toMilli(double d) {return x(d, (C2/C7), MAX/(C2/C7));}
		public double toCenti(double d) {return x(d, (C3/C7), MAX/(C3/C7));}
		public double toDeci(double d) 	{return x(d, (C4/C7), MAX/(C4/C7));}
		public double toMeter(double d) {return x(d, (C5/C7), MAX/(C5/C7));}
		public double toDeca(double d) 	{return x(d, (C6/C7), MAX/(C6/C7));}
		public double toHecta(double d) {return d;}
		public double toKilo(double d) 	{return d/(C8/C7);}
		public double toMile(double d) 	{return d/(C9/C7);}
		public double convert(double d, DistanceUnit u) {
			return u.toHecta(d);
		}
	},
	KiloMeter {
		public double toNano(double d) 	{return x(d, (C0/C8), MAX/(C0/C8));}
		public double toMicro(double d) {return x(d, (C1/C8), MAX/(C1/C8));}
		public double toMilli(double d) {return x(d, (C2/C8), MAX/(C2/C8));}
		public double toCenti(double d) {return x(d, (C3/C8), MAX/(C3/C8));}
		public double toDeci(double d) 	{return x(d, (C4/C8), MAX/(C4/C8));}
		public double toMeter(double d) {return x(d, (C5/C8), MAX/(C5/C8));}
		public double toDeca(double d) 	{return x(d, (C6/C8), MAX/(C6/C8));}
		public double toHecta(double d) {return x(d, (C7/C8), MAX/(C7/C8));}
		public double toKilo(double d) 	{return d;}
		public double toMile(double d) 	{return d/(C9/C8);}
		public double convert(double d, DistanceUnit u) {
			return u.toKilo(d);
		}
	},
	Mile {
		public double toNano(double d) 	{return x(d, (C0/C9), MAX/(C0/C9));}
		public double toMicro(double d) {return x(d, (C1/C9), MAX/(C1/C9));}
		public double toMilli(double d) {return x(d, (C2/C9), MAX/(C2/C9));}
		public double toCenti(double d) {return x(d, (C3/C9), MAX/(C3/C9));}
		public double toDeci(double d) 	{return x(d, (C4/C9), MAX/(C4/C9));}
		public double toMeter(double d) {return x(d, (C5/C9), MAX/(C5/C9));}
		public double toDeca(double d) 	{return x(d, (C6/C9), MAX/(C6/C9));}
		public double toHecta(double d) {return x(d, (C7/C9), MAX/(C7/C9));}
		public double toKilo(double d) 	{return x(d, (C7/C9), MAX/(C7/C9));}
		public double toMile(double d) 	{return d;}
		public double convert(double d, DistanceUnit u) {
			return u.toMile(d);
		}
	};
	
	private static final double C0 = 1;
	private static final double C1 = C0 * 10;
	private static final double C2 = C1 * 10;
	private static final double C3 = C2 * 10;
	private static final double C4 = C3 * 10;
	private static final double C5 = C4 * 10;
	private static final double C6 = C5 * 10;
	private static final double C7 = C6 * 10;
	private static final double C8 = C7 * 10;
	private static final double C9 = C8 * 0.62137119;

	private static final double MIN = Double.MIN_VALUE;
	private static final double MAX = Double.MAX_VALUE;
	
	public double toNano(double d) 	{throw new AbstractMethodError();}
	public double toMicro(double d) {throw new AbstractMethodError();}
	public double toMilli(double d) {throw new AbstractMethodError();}
	public double toCenti(double d) {throw new AbstractMethodError();}
	public double toDeci(double d) 	{throw new AbstractMethodError();}
	public double toMeter(double d) {throw new AbstractMethodError();}
	public double toDeca(double d) 	{throw new AbstractMethodError();}
	public double toHecta(double d) {throw new AbstractMethodError();}
	public double toKilo(double d) 	{throw new AbstractMethodError();}
	public double toMile(double d) 	{throw new AbstractMethodError();}
	public double convert(double d, DistanceUnit u) {throw new AbstractMethodError();}
	
	private static double x(double d, double m, double over) {
		if(d > over) return MAX;
		if(d < -over) return MIN;
		return d * m;
	}
	
}

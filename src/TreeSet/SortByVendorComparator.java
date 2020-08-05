package TreeSet;

import java.util.Comparator;

public class SortByVendorComparator implements Comparator<Biscuits> {

	@Override
	public int compare(Biscuits b1, Biscuits b2) {
		// TODO Auto-generated method stub
		return b1.vendor.compareTo(b2.vendor);
	}

}

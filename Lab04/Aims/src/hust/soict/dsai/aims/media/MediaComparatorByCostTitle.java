package hust.soict.dsai.aims.media;
import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{
	@Override
	public int compare(Media m1, Media m2) {
        int costComparison = Double.compare(m1.getCost(), m2.getCost());
        if (costComparison != 0) {
            // If costs are different, return the comparison result
            return costComparison;
        } else {
            // If costs are the same, sort by title in lexicographic order
            return m1.getTitle().compareTo(m2.getTitle());
        }
    }
}
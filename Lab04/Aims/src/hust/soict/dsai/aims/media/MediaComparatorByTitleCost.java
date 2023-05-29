package hust.soict.dsai.aims.media;
import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media>{
	@Override
	public int compare(Media m1, Media m2) {
		int titleComparison = m1.getTitle().compareTo(m2.getTitle());
        if (titleComparison != 0) {
            // If titles are different, return the comparison result
            return titleComparison;
        } else {
            // If titles are the same, sort by cost in ascending order
            return Double.compare(m1.getCost(), m2.getCost());
        }
	}
}
package spim.process.interestpointregistration.pairwise.constellation.overlap;

import net.imglib2.Interval;

public interface OverlapDetection< V >
{
	public boolean overlaps( final V view1, final V view2 );
	public Interval getOverlapInterval( final V view1, final V view2 );
}

package com.palmaplus2;

import java.io.IOException;
import com.esri.arcgis.geometry.ISegmentCollection;
import com.google.protobuf.Message.Builder;
import com.palmaplus.ocean.PlanarGraphics.Feature;

//外观模式应用
public class Facade {

	private FeatureS feature;
	private Segmentclass segmentclass;
	
	public Facade() {
		feature = new FeatureS();
		segmentclass = new Segmentclass();
	}
	
	public void setBuilder(ISegmentCollection segmentCollection,
			Builder bui) throws IOException {
		segmentclass.setBuilder(segmentCollection, bui);
	}
	
	public void setFeatureBuilder(Object column_value, 
			Feature.Builder ownedFeatureBuilder) {
		feature.setFeatureBuilder(column_value, ownedFeatureBuilder);
		
	}
}

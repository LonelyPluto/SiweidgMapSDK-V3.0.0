package org.oscim.event;


import org.oscim.core.GeoPoint;
import org.oscim.core.MapPosition;

/**
 * 地图事件接口
 */
public interface MapViewListener {
    /**
     * 单击
     * @param geoPoint
     * @return
     */
    boolean onSingleTap(GeoPoint geoPoint);

    /**
     * 长按
     * @param geoPoint
     * @return
     */
    boolean onLongPress(GeoPoint geoPoint);

//    /**
//     * 滑动
//     * @param mapPosition
//     */
//    void onMapMoveEvent(MapPosition mapPosition);

    /**
     * 滑动结束
     */
    void onEndFly();

}

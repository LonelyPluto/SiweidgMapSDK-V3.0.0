/*
 * Copyright 2013 Hannes Janetzek
 *
 * This file is part of the OpenScienceMap project (http://www.opensciencemap.org).
 *
 * This program is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.oscim.layers;

import com.siweidg.siweimapsdk.map.SiweidgMap;
import org.oscim.renderer.BitmapRenderer;
import org.oscim.renderer.LayerRenderer;

public class BitmapLayer extends GenericLayer {

    /**
     * Class for rendering a Bitmap as overlay. The
     * set Bitmap can be modified and updated:
     * See {@link BitmapRenderer}
     */
    public BitmapLayer(SiweidgMap map, LayerRenderer renderer) {
        super(map, new BitmapRenderer());
    }

    public BitmapRenderer getBitmapRenderer() {
        return (BitmapRenderer) mRenderer;
    }

}

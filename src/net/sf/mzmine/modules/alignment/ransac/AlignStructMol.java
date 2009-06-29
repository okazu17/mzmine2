/*
 * Copyright 2006-2009 The MZmine 2 Development Team
 *
 * This file is part of MZmine 2.
 *
 * MZmine 2 is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * MZmine 2 is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * MZmine 2; if not, write to the Free Software Foundation, Inc., 51 Franklin St,
 * Fifth Floor, Boston, MA 02110-1301 USA
 */
package net.sf.mzmine.modules.alignment.ransac;

import net.sf.mzmine.data.PeakListRow;

public class AlignStructMol {

    public PeakListRow row1,  row2;
    public double RT,  RT2;
    public boolean Aligned= false;
    public boolean ransacMaybeInLiers;
    public boolean ransacAlsoInLiers; 

    public AlignStructMol(PeakListRow row1, PeakListRow row2) {
        this.row1 = row1;
        this.row2 = row2;      
		RT = row1.getAverageRT();
	    RT2 = row2.getAverageRT();
    }

    public boolean isMols(PeakListRow row1, PeakListRow row2) {
        if (this.row1 == row1 && this.row2 == row2) {
            return true;
        }
        return false;
    }

	public boolean isHere(PeakListRow row){
		if (this.row1 == row || this.row2 == row) {
            return true;
        }
        return false;
	}   
}



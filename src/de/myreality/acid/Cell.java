/* Acid - Provides a Java cell API to display fancy cell boxes.
 * Copyright (C) 2013  Miguel Gonzalez
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
 */

package de.myreality.acid;

/**
 * Cell which is managed by the {@link CellManager}
 * 
 * @author Miguel Gonzalez <miguel-gonzalez@gmx.de>
 * @since 1.0
 * @version 1.0
 */
public interface Cell {
	
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================
	
	/**
	 * @return the current x position
	 */
	int getIndexX();
	
	/**
	 * @return the current y position
	 */
	int getIndexY();
	
	/**
	 * @return the amount of red color
	 */
	float getRed();
	
	/**
	 * @return the amount of green color
	 */
	float getGreen();
	
	/**
	 * @return the amount of blue color
	 */
	float getBlue();
	
	/**
	 * @return the amount of alpha opacity
	 */
	float getAlpha();
	
	/**
	 * Returns the current cell renderer to draw this cell
	 * @return current cell renderer
	 */
	CellRenderer getRenderer();
}
/*
 * Copyright 2010, 2011, 2012 mapsforge.org
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
package org.mapsforge.android.maps.rendertheme;

final class ClosedWayMatcher implements ClosedMatcher {
	private static final ClosedWayMatcher INSTANCE = new ClosedWayMatcher();

	static ClosedWayMatcher getInstance() {
		return INSTANCE;
	}

	/**
	 * Private constructor to prevent instantiation from other classes.
	 */
	private ClosedWayMatcher() {
		// do nothing
	}

	@Override
	public boolean isCoveredBy(ClosedMatcher closedMatcher) {
		return closedMatcher.matches(Closed.YES);
	}

	@Override
	public boolean matches(Closed closed) {
		return closed == Closed.YES;
	}
}

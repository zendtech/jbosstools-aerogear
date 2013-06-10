/*******************************************************************************
 * Copyright (c) 2007-2013 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributor:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.vpe.cordovasim.model.preferences;

import org.eclipse.swt.graphics.Point;
import org.jboss.tools.vpe.browsersim.model.preferences.SpecificPreferences;

/**
 * @author Konstantin Marmalyukov (kmarmaliykov)
 */
public class CordovaSimSpecificPreferences extends SpecificPreferences{
	private Point cordovaBrowserSize;
	private Point cordovaBrowserLocation;
	
	public CordovaSimSpecificPreferences(String selectedDeviceId, boolean useSkins, boolean enableLiveReload,
			int orientationAngle, Point location, Point cordovaBrowserLocation, Point cordovaBrowserSize) {
		super(selectedDeviceId, useSkins, enableLiveReload, orientationAngle, location);
		this.cordovaBrowserLocation = cordovaBrowserLocation;
		this.cordovaBrowserSize = cordovaBrowserSize;
	}

	public CordovaSimSpecificPreferences(String selectedDeviceId, boolean useSkins, boolean enableLiveReload,
			int orientationAngle, Point location) {
		super(selectedDeviceId, useSkins, enableLiveReload, orientationAngle, location);
	}

	public Point getCordovaBrowserLocation() {
		return cordovaBrowserLocation;
	}

	public void setCordovaBrowserLocation(Point cordovaBrowserLocation) {
		this.cordovaBrowserLocation = cordovaBrowserLocation;
	}

	public Point getCordovaBrowserSize() {
		return cordovaBrowserSize;
	}

	public void setCordovaBrowserSize(Point cordovaBrowserSize) {
		this.cordovaBrowserSize = cordovaBrowserSize;
	}

}

package cz.muni.fi.diagram.imagecontrol.jface.actions;

import java.util.function.Supplier;

import org.eclipse.jface.resource.ImageDescriptor;

import cz.muni.fi.diagram.imagecontrol.ImageControl;

public class ZoomResetAction extends ControlAction<ImageControl> {

	public ZoomResetAction(final Supplier<ImageControl> imageControlSupplier) {
		super(imageControlSupplier);
		setImageDescriptor(ImageDescriptor.createFromFile(ControlAction.class, "/icons/ZoomReset16.gif"));
	}

	@Override
	public void run() {
		getControl().resetZoom();
	}
}

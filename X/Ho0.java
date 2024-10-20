package X;

import com.facebook.spectrum.image.ImagePixelSpecification;
import com.facebook.spectrum.image.ImageSize;
import com.facebook.spectrum.requirements.ResizeRequirement;

/* loaded from: Ho0.class */
public abstract class Ho0 {
    public ResizeRequirement A01 = null;
    public ImagePixelSpecification A00 = null;

    public void A00(ResizeRequirement.Mode mode, ImageSize imageSize) {
        this.A01 = new ResizeRequirement(mode, imageSize);
    }
}

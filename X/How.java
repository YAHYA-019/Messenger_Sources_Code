package X;

import com.facebook.ui.media.attachments.model.MediaResource;

/* loaded from: How.class */
public final class How {
    public double A00 = 0.0d;
    public double A01 = 0.0d;
    public final MediaResource A02;
    public final /* synthetic */ ISH A03;

    public How(ISH ish, MediaResource mediaResource) {
        this.A03 = ish;
        this.A02 = mediaResource;
    }

    public void A00(double d) {
        double d2 = this.A00 + d;
        this.A00 = d2;
        if (d2 - this.A01 >= 0.05d) {
            AbstractC2326GOr.A0w(this.A02, (1I7) this.A03.A03.get(), "com.facebook.orca.media.upload.MEDIA_TRANSCODE_PROGRESS", this.A00);
            this.A01 = this.A00;
        }
    }
}

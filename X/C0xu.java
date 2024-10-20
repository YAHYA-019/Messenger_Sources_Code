package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: X.0xu, reason: invalid class name */
/* loaded from: 0xu.class */
public final class C0xu implements 0Re {
    public final ContentInfo.Builder A00;

    public C0xu(0Rg r302) {
        this.A00 = new ContentInfo.Builder(r302.A01());
    }

    public C0xu(ClipData clipData, int i) {
        this.A00 = new ContentInfo.Builder(clipData, i);
    }

    public 0Rg ACd() {
        final ContentInfo build = this.A00.build();
        return new 0Rg(new 0Rf(build) { // from class: X.0xp
            public final ContentInfo A00;

            {
                build.getClass();
                this.A00 = build;
            }

            public ClipData Acq() {
                return this.A00.getClip();
            }

            public int BBe() {
                return this.A00.getSource();
            }

            public ContentInfo BL0() {
                return this.A00;
            }

            public Bundle getExtras() {
                return this.A00.getExtras();
            }

            public int getFlags() {
                return this.A00.getFlags();
            }

            public Uri getLinkUri() {
                return this.A00.getLinkUri();
            }

            public String toString() {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("ContentInfoCompat{");
                A0k.append(this.A00);
                return AnonymousClass001.A0d("}", A0k);
            }
        });
    }

    public void Cmw(ClipData clipData) {
        this.A00.setClip(clipData);
    }

    public void Cop(int i) {
        this.A00.setFlags(i);
    }

    public void CqY(Uri uri) {
        this.A00.setLinkUri(uri);
    }

    public void setExtras(Bundle bundle) {
        this.A00.setExtras(bundle);
    }
}

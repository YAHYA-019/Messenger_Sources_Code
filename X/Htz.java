package X;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: Htz.class */
public final class Htz {
    public boolean A02;
    public int A00 = 0;
    public IBB A01 = new IBB(0, 0);
    public final I4V A03 = I4V.A00();
    public final ArrayList A04 = AnonymousClass001.A0s();
    public final HashMap A05 = AnonymousClass001.A0u();
    public final Camera.PreviewCallback A06 = new IGw(this, 0);
    public final Camera.PreviewCallback A07 = new IGw(this, 1);

    public void A00() {
        synchronized (this) {
            this.A03.A01();
            this.A05.clear();
            this.A04.clear();
        }
    }

    public void A01(Camera camera) {
        synchronized (this) {
            if (AnonymousClass001.A1W(DKD.A10(), Thread.currentThread())) {
                throw AnonymousClass001.A0T("Cannot disable listeners on the UI thread");
            }
            camera.setPreviewCallbackWithBuffer(null);
            camera.setPreviewCallback(null);
            this.A02 = false;
        }
    }

    public void A02(Camera camera, IBB ibb, int i) {
        RuntimeException th;
        int i2;
        synchronized (this) {
            if (AnonymousClass001.A1W(DKD.A10(), Thread.currentThread())) {
                th = AnonymousClass001.A0T("Cannot enable listeners on the UI thread");
            } else if (!this.A02) {
                this.A00 = i;
                if (ibb == null) {
                    new IBB(0, 0);
                }
                this.A01 = ibb;
                camera.getClass();
                HashMap hashMap = this.A05;
                if (!hashMap.isEmpty()) {
                    camera.setPreviewCallback(null);
                    IBB ibb2 = this.A01;
                    try {
                        Iterator A13 = GOo.A13(hashMap);
                        int i3 = 0;
                        int i4 = 0;
                        while (A13.hasNext()) {
                            int A09 = GOn.A09(A13.next());
                            if (A09 > i4) {
                                i4 = A09;
                            }
                        }
                        if (i != 842094169) {
                            i2 = ImageFormat.getBitsPerPixel(i) * ibb2.A02 * ibb2.A01;
                            if (i2 % 8 != 0) {
                                throw AnonymousClass001.A0N("Total bits for Frame should be a multiple of 8");
                            }
                        } else {
                            int A02 = GOn.A02(ibb2.A02 / 16.0d) * 16;
                            int A022 = GOn.A02((A02 / 2) / 16.0d) * 16;
                            int i5 = ibb2.A01;
                            i2 = (A02 * i5) + (((A022 * i5) / 2) * 2);
                        }
                        int i6 = i2 / 8;
                        ArrayList arrayList = this.A04;
                        if (arrayList.isEmpty()) {
                            while (i3 < i4) {
                                arrayList.add(new byte[i6]);
                                i3++;
                            }
                        } else {
                            if (((byte[]) arrayList.get(0)).length != i6) {
                                arrayList.clear();
                            }
                            int size = arrayList.size();
                            if (i4 > size) {
                                int i7 = i4 - size;
                                while (i3 < i7) {
                                    arrayList.add(new byte[i6]);
                                    i3++;
                                }
                            } else if (i4 < size) {
                                ArrayList A0t = AnonymousClass001.A0t(i4);
                                while (i3 < i4) {
                                    A0t.add((byte[]) arrayList.get(i3));
                                    i3++;
                                }
                                arrayList.clear();
                                arrayList.addAll(A0t);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            camera.addCallbackBuffer((byte[]) it.next());
                        }
                        camera.setPreviewCallbackWithBuffer(this.A07);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    camera.setPreviewCallbackWithBuffer(null);
                    camera.setPreviewCallback(this.A06);
                }
                this.A02 = true;
            }
            throw th;
        }
    }
}

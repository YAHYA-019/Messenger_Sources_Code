package X;

/* renamed from: X.368, reason: invalid class name */
/* loaded from: 368.class */
public final class AnonymousClass368 extends 2EZ {
    public boolean A00;
    public final String A01;

    public AnonymousClass368(String str) {
        this.A01 = str;
    }

    public void close() {
        this.A00 = true;
    }

    public int getHeight() {
        return -1;
    }

    public int getSizeInBytes() {
        String str = this.A01;
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    public int getWidth() {
        return -1;
    }

    public boolean isClosed() {
        return this.A00;
    }
}

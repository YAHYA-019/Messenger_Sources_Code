package X;

import java.io.Serializable;

/* renamed from: X.28c, reason: invalid class name */
/* loaded from: 28c.class */
public final class C28c implements Comparable, Serializable {
    public static final C28c A00 = new C28c(null, null, null, 0, 0, 0);
    public static final long serialVersionUID = 1;
    public final String _artifactId;
    public final String _groupId;
    public final int _majorVersion;
    public final int _minorVersion;
    public final int _patchLevel;
    public final String _snapshotInfo;

    public C28c(String str, String str2, String str3, int i, int i2, int i3) {
        this._majorVersion = i;
        this._minorVersion = i2;
        this._patchLevel = i3;
        this._snapshotInfo = str;
        this._groupId = str2 == null ? "" : str2;
        this._artifactId = str3 == null ? "" : str3;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        C28c c28c = (C28c) obj;
        if (c28c == this) {
            compareTo = 0;
        } else {
            compareTo = this._groupId.compareTo(c28c._groupId);
            if (compareTo == 0) {
                compareTo = this._artifactId.compareTo(c28c._artifactId);
                if (compareTo == 0) {
                    compareTo = this._majorVersion - c28c._majorVersion;
                    if (compareTo == 0) {
                        compareTo = this._minorVersion - c28c._minorVersion;
                        if (compareTo == 0) {
                            return this._patchLevel - c28c._patchLevel;
                        }
                    }
                }
            }
        }
        return compareTo;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C28c c28c = (C28c) obj;
            if (c28c._majorVersion != this._majorVersion || c28c._minorVersion != this._minorVersion || c28c._patchLevel != this._patchLevel || !c28c._artifactId.equals(this._artifactId) || !c28c._groupId.equals(this._groupId)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this._artifactId.hashCode() ^ (((this._groupId.hashCode() + this._majorVersion) - this._minorVersion) + this._patchLevel);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this._majorVersion);
        A0k.append('.');
        A0k.append(this._minorVersion);
        A0k.append('.');
        A0k.append(this._patchLevel);
        String str = this._snapshotInfo;
        if (str != null && str.length() > 0) {
            A0k.append('-');
            A0k.append(str);
        }
        return A0k.toString();
    }
}

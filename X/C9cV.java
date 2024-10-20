package X;

/* renamed from: X.9cV, reason: invalid class name */
/* loaded from: 9cV.class */
public final class C9cV {
    public final Ez8 A00;
    public final Integer A01;
    public final String A02;

    public C9cV(Ez8 ez8, Integer num, String str) {
        this.A01 = num;
        this.A02 = str;
        this.A00 = ez8;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9cV)) {
                return false;
            }
            C9cV c9cV = (C9cV) obj;
            if (this.A01 != c9cV.A01 || !11T.A0O(this.A02, c9cV.A02) || !11T.A0O(this.A00, c9cV.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "IMAGE";
                break;
            case 2:
                str = "VIDEO";
                break;
            default:
                str = "TEXT";
                break;
        }
        return (((7zM.A04(str, intValue) * 31) + 1BL.A05(this.A02)) * 31) + 4YU.A03(this.A00);
    }

    public String toString() {
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FeedbackSuggestionPreviewState(previewType=");
        Integer num = this.A01;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "IMAGE";
                    break;
                case 2:
                    str = "VIDEO";
                    break;
                default:
                    str = "TEXT";
                    break;
            }
        } else {
            str = "null";
        }
        A0k.append(str);
        A0k.append(", previewText=");
        A0k.append(this.A02);
        A0k.append(", generatedMedia=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}

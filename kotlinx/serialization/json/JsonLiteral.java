package kotlinx.serialization.json;

import X.11T;
import X.5Zh;
import X.7zM;
import X.AnonymousClass001;
import X.AnonymousClass002;

/* loaded from: JsonLiteral.class */
public final class JsonLiteral extends JsonPrimitive {
    public final String A00;
    public final boolean A01;

    public JsonLiteral(Object obj, boolean z) {
        11T.A0F(obj, 1);
        this.A01 = z;
        this.A00 = obj.toString();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            JsonLiteral jsonLiteral = (JsonLiteral) obj;
            if (this.A01 != jsonLiteral.A01 || !11T.A0O(this.A00, jsonLiteral.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A00, AnonymousClass002.A00(this.A01 ? 1 : 0) * 31);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String toString() {
        if (!this.A01) {
            return this.A00;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        5Zh.A00(A0k, this.A00);
        return 11T.A02(A0k);
    }
}

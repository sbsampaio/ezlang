package tables;

import java.util.Formatter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class StrTable {

    private final Map<String, Integer> table = new LinkedHashMap<>();

    public int add(String string) {
        Integer pos = table.get(string);

        if (pos != null)
            return pos;

        pos = table.size();
        table.put(string, pos);

        return pos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Formatter f = new Formatter(sb);

        f.format("Strings table:\n");

        for (Entry<String, Integer> entry : table.entrySet())
            f.format("Entry %d -- %s\n", entry.getValue(), entry.getKey());

        f.close();
        return sb.toString();
    }
}

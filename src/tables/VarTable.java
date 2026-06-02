package tables;

import java.util.LinkedHashMap;
import java.util.Map;

import typing.EZType;

public final class VarTable {
    private Map<String, Entry> table = new LinkedHashMap<>();

    public Entry lookup(String id) {
        return table.get(id);
    }

    public void add(String id, int line, EZType type) {
        Entry entry = new Entry(id, line, type);
        table.put(id, entry);
    }

    private class Entry {
        public String id;
        public int line;
        public EZType type;

        Entry(String id, int line, EZType type) {
            this.id = id;
            this.line = line;
            this.type = type;
        }
    }
}

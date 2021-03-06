package org.HashMap;

import java.util.ArrayList;

public class HashMapImplementation {
	public static void main(String args[]) {

		HashMap hash = new HashMap();
		hash.set("raza", "Anwar");
		System.out.println(hash.get("raza"));
	}

	public static class HashMap {
		public class Entry {
			String key;
			Object value;

			public Entry(String key, Object value) {
				this.key = key;
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public Object getValue() {
				return this.value;
			}

			public void setValue(Object value) {
				this.value = value;
			}

			public String toString() {
				return "Key : " + this.key + ", Value : " + this.value;
			}

		}

		ArrayList<ArrayList<Entry>> storage;

		public HashMap() {
			this.storage = new ArrayList<ArrayList<Entry>>();
			for (int i=0;i<16;i++)
				this.storage.add(new ArrayList<Entry>());
		}

		public int hashStr(String s) {
			int hash = 0;
			for (char c : s.toCharArray())
				hash += c;
			return hash % 16;
		}

		public Entry get(String key) {
			int intKey = hashStr(key);
			if (this.storage.get(intKey) != null)
				for (Entry e : storage.get(intKey)) {
					if (e.getKey().equals(key))
						return e;
				}
			return null;
		}

		public void set(String key, Object value) {
			int intKey = hashStr(key);

			if (this.storage.get(intKey) == null) {
				ArrayList<Entry> temp = new ArrayList<Entry>();
				temp.add(new Entry(key, value));
				this.storage.add(intKey,temp);
			} else {
				ArrayList<Entry> temp = this.storage.get(intKey);
				temp.add(new Entry(key, value));
				this.storage.set(intKey, temp);
			}
		}
	}
}

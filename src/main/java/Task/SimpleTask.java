package Task;

public class SimpleTask extends Task {
    protected String title;

    public SimpleTask(int id, String title) {
        super(id);
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean matches(String query) {
        return title.contains(query);
    }

    public class Epic extends Task {
        protected String title;

        public Epic(int id, String title) {
            super(id);
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public class Meeting extends Task {
            protected String title;

            public Meeting(int id) {
                super(id);
            }

            public boolean Meeting(int id, String title) {
                this.title = title;
                return false;
            }
        }
    }
}














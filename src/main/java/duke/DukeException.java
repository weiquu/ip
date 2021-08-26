package duke;

public class DukeException extends Exception {
    /**
     * Constructs a new DukeException.
     * Simple DukeException that contains a string describing the error.
     *
     * @param error The error message that describes the error that occurred.
     */
    public DukeException(String error) {
        super(error);
    }
}

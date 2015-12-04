package by.khrapovitsky.adapter;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.ResourceCursorAdapter;
import android.widget.TextView;

import by.khrapovitsky.R;

public class NotesCursorAdapter extends ResourceCursorAdapter {


    public NotesCursorAdapter(Context context, int layout, Cursor c, int flags) {
        super(context, layout, c, flags);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView idNote = (TextView) view.findViewById(R.id.idNote);
        TextView note = (TextView) view.findViewById(R.id.note);
        TextView lastDateModify = (TextView) view.findViewById(R.id.lastDateModify);
        Integer id = cursor.getInt(cursor.getColumnIndexOrThrow("_id"));
        String noteText = cursor.getString(cursor.getColumnIndexOrThrow("noteText"));
        String date = cursor.getString(cursor.getColumnIndexOrThrow("lastDateModify"));
        idNote.setText(id.toString());
        note.setText(noteText);
        lastDateModify.setText(date);
    }
}

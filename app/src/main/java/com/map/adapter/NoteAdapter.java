package com.map.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;

import com.map.R;
import com.map.adapter.template.ModelAdapter;
import com.map.model.Note;
import com.map.widget.NoteViewHolder;

public class NoteAdapter extends ModelAdapter<Note, NoteViewHolder> {
	public NoteAdapter(ArrayList<Note> items, ArrayList<Note> selected, ClickListener<Note> listener) {
		super(items, selected, listener);
	}

	@Override
	public NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		return new NoteViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note, parent, false));
	}
}
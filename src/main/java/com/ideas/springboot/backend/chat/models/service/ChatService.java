package com.ideas.springboot.backend.chat.models.service;

import com.ideas.springboot.backend.chat.models.documents.Mensaje;

import java.util.List;

public interface ChatService {
   List<Mensaje> obtenerUltimo10Mensajes();
   Mensaje guardar(Mensaje mensaje);
}

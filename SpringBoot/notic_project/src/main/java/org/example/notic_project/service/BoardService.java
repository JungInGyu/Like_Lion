package org.example.notic_project.service;

import lombok.RequiredArgsConstructor;
import org.example.notic_project.domain.Board;
import org.example.notic_project.repository.BoardRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    @Transactional(readOnly = true)
    public Iterable<Board> findAllBoard(){
        return boardRepository.findAll();
    }

    //친구등록
    @Transactional
    public Board saveBoard(Board board){
        return boardRepository.save(board);
    }

    @Transactional(readOnly = true)
    public Board findBoardById(Long id){
        return boardRepository.findById(id).orElse(null);
    }
    @Transactional
    public void deleteBoardById(Long id){
        boardRepository.deleteById(id);
    }

    public Page<Board> findAllBoards(Pageable pageable){
        Pageable sortedByDescId =  PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(),
                Sort.by(Sort.Direction.DESC,"id"));

        return boardRepository.findAll(sortedByDescId);
    }
}

package com.example.roomts.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {
//    protected fun <T> mutableUiStateFlow() = MutableStateFlow<UIState<T>>(UIState.Idle())
//
//    protected fun <T, S> Flow<Either<String, T>>.gatherRequest(
//        state: MutableStateFlow<UIState<S>>,
//        mappedData: (data: T) -> S,
//    ) {
//        viewModelScope.launch(Dispatchers.IO) {
//            state.value = UIState.Loading()
//            this@gatherRequest.collect {
//                when (it) {
//                    is Either.Left -> state.value = UIState.Error(it.value)
//                    is Either.Right -> state.value =
//                        UIState.Success(mappedData(it.value))
//                }
//            }
//
//        }
//    }
////    protected fun <T, S> Flow<T>.gatherRequest(
////        state: MutableStateFlow<UIState<S>>,
////        mappedData: (data: T) -> S,
////    ) {
////        viewModelScope.launch(Dispatchers.IO) {
////            state.value = UIState.Loading()
////            this@gatherRequest.collect {
////                when (it) {
////                    is UIState.Success(state.value = data)
////                is UIState.Error(message = it)
////                    is Either.Left -> state.value = UIState.Error(it.value)
////                    is Either.Right -> state.value =
////                        UIState.Success(mappedData(it.value))
////                }
////            }
////
////        }
////    }
//
//    protected fun <T : Any, S : Any> Flow<PagingData<T>>.gatherPagingRequest(
//        mappedData: (data: T) -> S,
//    ) = map {
//        it.map { data -> mappedData(data) }
//    }.cachedIn(viewModelScope)
//}
}
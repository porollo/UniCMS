import {takeEvery} from "@redux-saga/core/effects";
import {FETCH_USERS} from "./types";


export function* sagaWatcher() {

    yield takeEvery(FETCH_USERS, sagaWorker)

}

function* sagaWorker() {

    try {
        yield put(showLoader())
        const payload = yield call(fetchUsers)
        yield put({type: FETCH_USERS, payload})
        yield put(hideLoader())

    } catch (e) {
        yield put (showAlert("Unable to retrieve data"))
        yield put (hideLoader())
    }
}

async function fetchUsers() {
    const response = await fetch('*********************')
    return await response.json()
}
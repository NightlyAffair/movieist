import axios from 'axios';

export default axios.create({
    baseURL: 'https://526c-219-74-0-165.ngrok-free.app',
    headers: {"ngrok-skip-browser-warning": "true"}
})